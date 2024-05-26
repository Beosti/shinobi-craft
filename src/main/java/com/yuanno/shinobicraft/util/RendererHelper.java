package com.yuanno.shinobicraft.util;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import org.joml.Matrix4f;

import java.awt.*;

/**
 * All stolen from Wynd (almost) thank you <3
 * Helper class for rendering in general
 */
public class RendererHelper {

    public static void drawIcon(ResourceLocation rs, PoseStack matrixStack, float x, float y, float z, float u, float v) {
        drawIcon(rs, matrixStack, x, y, z, u, v, 1, 1, 1, 1);
    }

    public static void drawIcon(ResourceLocation rs, PoseStack matrixStack, float x, float y, float z, float u, float v, int intColor) {
        Color color = new Color(intColor);
        drawIcon(rs, matrixStack, x, y, z, u, v, color.getRed() / 255f, color.getGreen() / 255f, color.getBlue() / 255f, 1);
    }

    public static void drawIcon(ResourceLocation rs, PoseStack matrixStack, float x, float y, float z, float u, float v, float red, float green, float blue,
                                float alpha) {
        drawIcon(rs, matrixStack, x, y, z, u, v, red, green, blue, alpha, false);
    }

    public static void drawIcon(ResourceLocation icon, PoseStack matrixStack, float x, float y, float z, float u, float v, float red, float green, float blue, float alpha, boolean flip) {
        float uvDir = flip ? -1.0f : 1.0f;
        Matrix4f matrix = matrixStack.last().pose();

        RenderSystem.enableBlend();
        RenderSystem.setShader(GameRenderer::getPositionColorTexShader);
        RenderSystem.setShaderTexture(0, icon);
        BufferBuilder bufferbuilder = Tesselator.getInstance().getBuilder();
        bufferbuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR_TEX);
        bufferbuilder.vertex(matrix, x, y + v, z).color(red, green, blue, alpha).uv(0.0f, uvDir).endVertex();
        bufferbuilder.vertex(matrix, x + u, y + v, z).color(red, green, blue, alpha).uv(uvDir, uvDir).endVertex();
        bufferbuilder.vertex(matrix, x + u, y, z).color(red, green, blue, alpha).uv(uvDir, 0.0f).endVertex();
        bufferbuilder.vertex(matrix, x, y, z).color(red, green, blue, alpha).uv(0.0f, 0.0f).endVertex();
        BufferUploader.drawWithShader(bufferbuilder.end());
        RenderSystem.disableBlend();
    }
}