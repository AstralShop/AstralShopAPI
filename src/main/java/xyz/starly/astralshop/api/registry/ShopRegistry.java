package xyz.starly.astralshop.api.registry;

import org.jetbrains.annotations.NotNull;
import xyz.starly.astralshop.api.shop.Shop;

import java.util.List;

public interface ShopRegistry {

    void loadShops();

    void loadShop(Shop shop);

    void saveShops();

    void saveShop(Shop shop);

    boolean createShop(@NotNull String name);

    boolean deleteShop(@NotNull String name);

    Shop getShop(String name);

    @NotNull List<Shop> getShops();
}