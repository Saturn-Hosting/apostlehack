package com.apostles.apostlehack;

import com.apostles.apostlehack.modules.PacketSender;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class ApostleHack extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("ApostleHack");

    @Override
    public void onInitialize() {
        LOG.info("Initializing ApostleHack");

        // Modules
        Modules.get().add(new PacketSender());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.apostles.apostlehack";
    }
}
