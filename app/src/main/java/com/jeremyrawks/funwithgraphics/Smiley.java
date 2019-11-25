package com.jeremyrawks.funwithgraphics;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;

public class Smiley extends Drawable {

    @Override
    public void draw(Canvas canvas) {

        final int LINE_WIDTH = 10;
        final int EYE_RADIUS = 50;
        final int EYE_OFFSET_X = EYE_RADIUS + 50;
        final int EYE_OFFSET_Y = EYE_RADIUS + 80;
        final int MOUTH_WIDTH = 280;
        final int MOUTH_OFFSET_Y = 180;

        // Get the drawable's bounds
        int width = getBounds().width();
        int height = getBounds().height();
        int centerX = width / 2;
        int centerY = height / 2;

        // Create paint brushes for each colour
        Paint blackPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        blackPaint.setColor(Color.BLACK);
        Paint yellowPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        yellowPaint.setColor(Color.YELLOW);

        // Draw the head
        final int HEAD_RADIUS = (width / 2) - 60;
        canvas.drawCircle(centerX, centerY, HEAD_RADIUS, blackPaint);
        canvas.drawCircle(centerX, centerY, HEAD_RADIUS - LINE_WIDTH, yellowPaint);

        // Draw the eyes
        canvas.drawCircle(centerX - EYE_OFFSET_X, centerY - EYE_OFFSET_Y, EYE_RADIUS, blackPaint);
        canvas.drawCircle(centerX + EYE_OFFSET_X, centerY - EYE_OFFSET_Y, EYE_RADIUS, blackPaint);

        // Draw the mouth
        blackPaint.setStrokeWidth(LINE_WIDTH);
        canvas.drawLine(centerX - (MOUTH_WIDTH / 2), centerY + MOUTH_OFFSET_Y,
                        centerX + (MOUTH_WIDTH / 2), centerY + MOUTH_OFFSET_Y,
                        blackPaint);
    }

    @Override
    public void setAlpha(int alpha) {
        // alpha determines transparency
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        // Gives the ColorFilter
    }

    @Override
    public int getOpacity() {
        // Must be PixelFormat.UNKNOWN, TRANSLUCENT, TRANSPARENT, or OPAQUE
        return PixelFormat.OPAQUE;
    }
}
