package net.redoptic.boozinmod.mixin;


import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.render.model.BlockStatesLoader;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.render.model.json.JsonUnbakedModel;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.util.Identifier;
import net.redoptic.boozinmod.BoozinMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.util.profiler.Profiler;

import java.util.List;
import java.util.Map;

@Mixin(ModelLoader.class)
public abstract class ModelLoaderMixin {

    @Shadow
    protected abstract void loadItemModel(ModelIdentifier modelId);

    @Inject(method = "<init>()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/model/ModelLoader;loadItemModel(Lnet/minecraft/client/util/ModelIdentifier;)V", ordinal = 1, shift = At.Shift.AFTER))
    public void addItemModel(BlockColors blockColors, Profiler profiler, Map<Identifier, JsonUnbakedModel> jsonUnbakedModels, Map<Identifier, List<BlockStatesLoader.SourceTrackedData>> blockStates, CallbackInfo ci) {
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "empty_jar_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "moonshine_jar_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "rum_glass_empty_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "rum_glass_full_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "rum_glass_unaged_full_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "wine_glass_empty_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "wine_glass_full_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "mead_glass_empty_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "mead_glass_full_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "whiskey_glass_empty_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "whiskey_glass_full_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "beer_mug_empty_3d")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "beer_mug_full_3d")));
    }
}
