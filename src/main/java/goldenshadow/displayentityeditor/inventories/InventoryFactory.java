package goldenshadow.displayentityeditor.inventories;

import goldenshadow.displayentityeditor.Utilities;
import goldenshadow.displayentityeditor.items.GUIItems;
import goldenshadow.displayentityeditor.items.InventoryItems;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.BlockDisplay;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.entity.TextDisplay;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryFactory {

    private final GUIItems guiItems;
    private final InventoryItems inventoryItems;

    public InventoryFactory(GUIItems guiItems, InventoryItems inventoryItems) {
        this.guiItems = guiItems;
        this.inventoryItems = inventoryItems;
    }

    /**
     * Getter for the gui items
     * @return The class containing all gui items
     */
    public GUIItems getGuiItems() {
        return guiItems;
    }


    /**
     * Used to create the gui for item displays
     * @param entity The item display entity being edited
     * @return The gui
     */
    public Inventory createItemDisplayGUI(ItemDisplay entity) {
        Inventory inventory = Bukkit.createInventory(null, 27, ChatColor.BOLD + "Item Display GUI");
        for (int i = 0; i < inventory.getSize(); i++) {
            switch (i) {
                case 4 -> inventory.setItem(i, guiItems.name(entity.getCustomName()));
                case 5 -> inventory.setItem(i, guiItems.rightRotNormalize(Utilities.getData(entity, "GUIRRNormalize")));
                case 6 -> inventory.setItem(i, guiItems.height(entity.getDisplayHeight()));
                case 7 -> inventory.setItem(i, guiItems.shadowRadius(entity.getShadowRadius()));
                case 8 -> inventory.setItem(i, guiItems.skyLight(entity.getBrightness() != null ? entity.getBrightness().getSkyLight() : -1));

                case 10 -> inventory.setItem(i, entity.getItemStack());
                case 12 -> inventory.setItem(i, guiItems.itemDisplayTransform(entity.getItemDisplayTransform()));
                case 13 -> inventory.setItem(i, guiItems.glowing(entity.isGlowing()));
                case 14 -> inventory.setItem(i, guiItems.leftRotNormalize(Utilities.getData(entity, "GUILRNormalize")));
                case 15 -> inventory.setItem(i, guiItems.width(entity.getDisplayWidth()));
                case 16 -> inventory.setItem(i, guiItems.shadowStrength(entity.getShadowStrength()));
                case 17 -> inventory.setItem(i, guiItems.blockLight(entity.getBrightness() != null ? entity.getBrightness().getBlockLight() : -1));

                case 22 -> inventory.setItem(i, guiItems.glowColor(entity.getGlowColorOverride()));
                case 23 -> inventory.setItem(i, guiItems.viewRange(entity.getViewRange()));
                case 24 -> inventory.setItem(i, guiItems.billboard(entity.getBillboard()));
                case 25 -> inventory.setItem(i, guiItems.lock());
                case 26 -> inventory.setItem(i, guiItems.delete());
                default -> inventory.setItem(i, guiItems.filler());
            }
        }
        return inventory;
    }

    /**
     * Used to create the gui for block displays
     * @param entity The block display entity being edited
     * @return The gui
     */
    public Inventory createBlockDisplayGUI(BlockDisplay entity) {
        Inventory inventory = Bukkit.createInventory(null, 27, ChatColor.BOLD + "Block Display GUI");
        for (int i = 0; i < inventory.getSize(); i++) {
            switch (i) {
                case 4 -> inventory.setItem(i, guiItems.name(entity.getCustomName()));
                case 5 -> inventory.setItem(i, guiItems.rightRotNormalize(Utilities.getData(entity, "GUIRRNormalize")));
                case 6 -> inventory.setItem(i, guiItems.height(entity.getDisplayHeight()));
                case 7 -> inventory.setItem(i, guiItems.shadowRadius(entity.getShadowRadius()));
                case 8 -> inventory.setItem(i, guiItems.skyLight(entity.getBrightness() != null ? entity.getBrightness().getSkyLight() : -1));

                case 10 -> inventory.setItem(i, new ItemStack(entity.getBlock().getMaterial()));
                case 11 -> inventory.setItem(i, guiItems.blockState(entity.getBlock().getAsString(true)));

                case 13 -> inventory.setItem(i, guiItems.glowing(entity.isGlowing()));
                case 14 -> inventory.setItem(i, guiItems.leftRotNormalize(Utilities.getData(entity, "GUILRNormalize")));
                case 15 -> inventory.setItem(i, guiItems.width(entity.getDisplayWidth()));
                case 16 -> inventory.setItem(i, guiItems.shadowStrength(entity.getShadowStrength()));
                case 17 -> inventory.setItem(i, guiItems.blockLight(entity.getBrightness() != null ? entity.getBrightness().getBlockLight() : -1));

                case 22 -> inventory.setItem(i, guiItems.glowColor(entity.getGlowColorOverride()));
                case 23 -> inventory.setItem(i, guiItems.viewRange(entity.getViewRange()));
                case 24 -> inventory.setItem(i, guiItems.billboard(entity.getBillboard()));
                case 25 -> inventory.setItem(i, guiItems.lock());
                case 26 -> inventory.setItem(i, guiItems.delete());
                default -> inventory.setItem(i, guiItems.filler());
            }
        }
        return inventory;
    }

    /**
     * Used to create the gui for text displays
     * @param entity The text display entity being edited
     * @return The gui
     */
    @SuppressWarnings("deprecation")
    public Inventory createTextDisplayGUI(TextDisplay entity) {
        Inventory inventory = Bukkit.createInventory(null, 27, ChatColor.BOLD + "Text Display GUI");
        for (int i = 0; i < inventory.getSize(); i++) {
            switch (i) {
                case 2 -> inventory.setItem(i, guiItems.textBackgroundColor(entity.getBackgroundColor()));
                case 3 -> inventory.setItem(i, guiItems.textDefaultBackground(entity.isDefaultBackground()));
                case 4 -> inventory.setItem(i, guiItems.name(entity.getCustomName()));
                case 5 -> inventory.setItem(i, guiItems.rightRotNormalize(Utilities.getData(entity, "GUIRRNormalize")));
                case 6 -> inventory.setItem(i, guiItems.height(entity.getDisplayHeight()));
                case 7 -> inventory.setItem(i, guiItems.shadowRadius(entity.getShadowRadius()));
                case 8 -> inventory.setItem(i, guiItems.skyLight(entity.getBrightness() != null ? entity.getBrightness().getSkyLight() : -1));

                case 10 -> inventory.setItem(i, guiItems.text());
                case 11 -> inventory.setItem(i, guiItems.textBackgroundOpacity(entity.getBackgroundColor()));
                case 12 -> inventory.setItem(i, guiItems.textSeeThrough(entity.isSeeThrough()));
                case 13 -> inventory.setItem(i, guiItems.textOpacity(entity.getTextOpacity()));
                case 14 -> inventory.setItem(i, guiItems.leftRotNormalize(Utilities.getData(entity, "GUILRNormalize")));
                case 15 -> inventory.setItem(i, guiItems.width(entity.getDisplayWidth()));
                case 16 -> inventory.setItem(i, guiItems.shadowStrength(entity.getShadowStrength()));
                case 17 -> inventory.setItem(i, guiItems.blockLight(entity.getBrightness() != null ? entity.getBrightness().getBlockLight() : -1));

                case 20 -> inventory.setItem(i, guiItems.textAlignment(entity.getAlignment()));
                case 21 -> inventory.setItem(i, guiItems.textShadow(entity.isShadowed()));
                case 22 -> inventory.setItem(i, guiItems.textLineWidth(entity.getLineWidth()));
                case 23 -> inventory.setItem(i, guiItems.viewRange(entity.getViewRange()));
                case 24 -> inventory.setItem(i, guiItems.billboard(entity.getBillboard()));
                case 25 -> inventory.setItem(i, guiItems.lock());
                case 26 -> inventory.setItem(i, guiItems.delete());
                default -> inventory.setItem(i, guiItems.filler());
            }
        }
        return inventory;
    }

    /**
     * Used to generate an array of tools to be easily added to a players inventory
     * @return An array of tools
     */
    public ItemStack[] getInventoryArray() {
        ItemStack[] array = new ItemStack[36];

        array[0] = inventoryItems.gui();
        array[1] = inventoryItems.rotateYaw();
        array[2] = inventoryItems.rotatePitch();
        array[3] = inventoryItems.moveX();
        array[4] = inventoryItems.moveY();
        array[5] = inventoryItems.moveZ();

        array[27] = inventoryItems.spawnItemDisplay();
        array[28] = inventoryItems.spawnBlockDisplay();
        array[29] = inventoryItems.spawnTextDisplay();
        array[30] = inventoryItems.centerPivot();
        array[31] = inventoryItems.highlightTarget();
        array[32] = inventoryItems.unlock();

        array[18] = inventoryItems.translationX();
        array[19] = inventoryItems.translationY();
        array[20] = inventoryItems.translationZ();
        array[21] = inventoryItems.scaleX();
        array[22] = inventoryItems.scaleY();
        array[23] = inventoryItems.scaleZ();

        array[9] = inventoryItems.leftRotationX();
        array[10] = inventoryItems.leftRotationY();
        array[11] = inventoryItems.leftRotationZ();
        array[12] = inventoryItems.rightRotationX();
        array[13] = inventoryItems.rightRotationY();
        array[14] = inventoryItems.rightRotationZ();

        return array;
    }


}
