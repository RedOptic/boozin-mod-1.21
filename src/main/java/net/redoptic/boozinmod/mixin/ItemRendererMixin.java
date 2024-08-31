package net.redoptic.boozinmod.mixin;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.redoptic.boozinmod.BoozinMod;
import net.redoptic.boozinmod.item.ModItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public class ItemRendererMixin {

    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useItemModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(ModItems.MOONSHINE_JAR_EMPTY) && renderMode != ModelTransformationMode.GUI) {
            BakedModel emptyJarModel = ((ItemRendererAccessor) this).boozinmod$getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "empty_jar_3d")));
            return emptyJarModel;
        }
        if (stack.isOf(ModItems.MOONSHINE_JAR_FULL) && renderMode != ModelTransformationMode.GUI) {
            BakedModel moonshineJarModel = ((ItemRendererAccessor) this).boozinmod$getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "moonshine_jar_3d")));
            return moonshineJarModel;
        }
        if (stack.isOf(ModItems.RUM_GLASS_EMPTY) && renderMode != ModelTransformationMode.GUI) {
            BakedModel rumGlassEmptyModel = ((ItemRendererAccessor) this).boozinmod$getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "rum_glass_empty_3d")));
            return rumGlassEmptyModel;
        }
        if (stack.isOf(ModItems.RUM_GLASS_FULL) && renderMode != ModelTransformationMode.GUI) {
            BakedModel rumGlassFullModel = ((ItemRendererAccessor) this).boozinmod$getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "rum_glass_full_3d")));
            return rumGlassFullModel;
        }
        if (stack.isOf(ModItems.RUM_GLASS_UNAGED_FULL) && renderMode != ModelTransformationMode.GUI) {
            BakedModel rumGlassFullUnagedModel = ((ItemRendererAccessor) this).boozinmod$getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "rum_glass_unaged_full_3d")));
            return rumGlassFullUnagedModel;
        }
        if (stack.isOf(ModItems.WINE_GLASS_EMPTY) && renderMode != ModelTransformationMode.GUI) {
            BakedModel wineGlassEmptyModel = ((ItemRendererAccessor) this).boozinmod$getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "wine_glass_empty_3d")));
            return wineGlassEmptyModel;
        }
        if (stack.isOf(ModItems.WINE_GLASS_FULL) && renderMode != ModelTransformationMode.GUI) {
            BakedModel wineGlassFullModel = ((ItemRendererAccessor) this).boozinmod$getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "wine_glass_full_3d")));
            return wineGlassFullModel;
        }
        if (stack.isOf(ModItems.MEAD_GLASS_EMPTY) && renderMode != ModelTransformationMode.GUI) {
            BakedModel meadGlassEmptyModel = ((ItemRendererAccessor) this).boozinmod$getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "mead_glass_empty_3d")));
            return meadGlassEmptyModel;
        }
        if (stack.isOf(ModItems.MEAD_GLASS_FULL) && renderMode != ModelTransformationMode.GUI) {
            BakedModel meadGlassFullModel = ((ItemRendererAccessor) this).boozinmod$getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "mead_glass_full_3d")));
            return meadGlassFullModel;
        }
        if (stack.isOf(ModItems.WHISKEY_GLASS_EMPTY) && renderMode != ModelTransformationMode.GUI) {
            BakedModel whiskeyGlassEmptyModel = ((ItemRendererAccessor) this).boozinmod$getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "whiskey_glass_empty_3d")));
            return whiskeyGlassEmptyModel;
        }
        if (stack.isOf(ModItems.WHISKEY_GLASS_FULL) && renderMode != ModelTransformationMode.GUI) {
            BakedModel whiskeyGlassFullModel = ((ItemRendererAccessor) this).boozinmod$getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "whiskey_glass_full_3d")));
            return whiskeyGlassFullModel;
        }
        if (stack.isOf(ModItems.BEER_MUG_EMPTY) && renderMode != ModelTransformationMode.GUI) {
            BakedModel beerMugEmptyModel = ((ItemRendererAccessor) this).boozinmod$getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "beer_mug_empty_3d")));
            return beerMugEmptyModel;
        }
        if (stack.isOf(ModItems.BEER_MUG_FULL) && renderMode != ModelTransformationMode.GUI) {
            BakedModel beerMugFullModel = ((ItemRendererAccessor) this).boozinmod$getModels().getModelManager().getModel(ModelIdentifier.ofInventoryVariant(Identifier.of(BoozinMod.MOD_ID, "beer_mug_full_3d")));
            return beerMugFullModel;
        }

        return value;
    }
}