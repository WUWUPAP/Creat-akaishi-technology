package com.wuwu.cat.itme;

import com.wuwu.cat.Creatakaishitechnology;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CATitems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Creatakaishitechnology.MODID);
    public static final DeferredItem<Item> CAT_core =
            ITEMS.register("cat_core",()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> Akaishi =
            ITEMS.register("akaishi",()->new Item(new Item.Properties()));
    public static final DeferredItem<Item> shit =
            ITEMS.register("shit",()->new Item(new Item.Properties()));

}
