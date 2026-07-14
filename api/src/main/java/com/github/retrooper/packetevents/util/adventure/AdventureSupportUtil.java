package com.github.retrooper.packetevents.util.adventure;

import net.kyori.adventure.text.event.ClickEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

@NullMarked
@ApiStatus.Internal
public class AdventureSupportUtil {

    private AdventureSupportUtil() {
    }

    public static String getStringValue(ClickEvent event) {
        return ((ClickEvent.Payload.Text) event.payload()).value();
    }

    public static int getIntValue(ClickEvent event) {
        return ((ClickEvent.Payload.Int) event.payload()).integer();
    }
}
