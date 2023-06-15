package helper;

import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An implementation of the default Bukkit {@link ItemStack} to provide
 * a similar ability to write/read the {@link ItemMeta} without CraftBukkit running.
 *
 * @author bibo38
 * @see ItemStack
 */
public class TestItemStack extends ItemStack {
    ItemMeta meta = null;

    /**
     * The common used constructor
     *
     * @param type The type of the ItemStack
     * @see ItemStack#ItemStack(Material)
     */
    public TestItemStack(Material type) {
        super(type);
    }

    @Override
    public ItemMeta getItemMeta() {
        if(meta == null)


            meta = new ItemMeta() {


                @NotNull
                @Override
                public PersistentDataContainer getPersistentDataContainer() {
                    return null;
                }

                @Override
                public void setVersion(int version) {

                }

                public org.bukkit.inventory.meta.tags.CustomItemTagContainer getCustomTagContainer() {
                    return null;
                }

                public String getAsString(){
                    return "";
                }

                @Override
                public boolean hasDisplayName() {
                    return false;
                }

                @Override
                public String getDisplayName() {
                    return null;
                }

                @Override
                public void setDisplayName(String s) {
                }

                @Override
                public boolean hasLocalizedName() {
                    return false;
                }

                @NotNull
                @Override
                public String getLocalizedName() {
                    return null;
                }

                @Override
                public void setLocalizedName(@Nullable String s) {

                }

                @Override
                public boolean hasLore() {
                    return false;
                }

                @Override
                public List<String> getLore() {
                    return null;
                }


                @Override
                public boolean hasCustomModelData() {
                    return false;
                }

                @Override
                public int getCustomModelData() {
                    return 0;
                }

                @Override
                public void setCustomModelData(@Nullable Integer integer) {

                }

                @Override
                public void setLore(List<String> list) {
                }

                @Override
                public boolean hasEnchants() {
                    return false;
                }



                @Override
                public boolean hasEnchant(Enchantment enchantment) {
                    return false;
                }

                @Override
                public int getEnchantLevel(Enchantment enchantment) {
                    return 0;
                }

                @Override
                public Map<Enchantment, Integer> getEnchants() {
                    return null;
                }

                @Override
                public boolean addEnchant(Enchantment enchantment, int i, boolean b) {
                    return false;
                }

                @Override
                public boolean removeEnchant(Enchantment enchantment) {
                    return false;
                }

                @Override
                public boolean hasConflictingEnchant(Enchantment enchantment) {
                    return false;
                }

                @Override
                public void addItemFlags(@NotNull ItemFlag... itemFlags) {

                }

                @Override
                public void removeItemFlags(@NotNull ItemFlag... itemFlags) {

                }

                @NotNull
                @Override
                public Set<ItemFlag> getItemFlags() {
                    return null;
                }

                @Override
                public boolean hasItemFlag(@NotNull ItemFlag itemFlag) {
                    return false;
                }

                @Override
                public boolean isUnbreakable() {
                    return false;
                }

                @Override
                public void setUnbreakable(boolean b) {

                }

                @Override
                public boolean hasAttributeModifiers() {
                    return false;
                }

                @Nullable
                @Override
                public Multimap<Attribute, AttributeModifier> getAttributeModifiers() {
                    return null;
                }

                @NotNull
                @Override
                public Multimap<Attribute, AttributeModifier> getAttributeModifiers(@NotNull EquipmentSlot equipmentSlot) {
                    return null;
                }

                @Nullable
                @Override
                public Collection<AttributeModifier> getAttributeModifiers(@NotNull Attribute attribute) {
                    return null;
                }

                @Override
                public boolean addAttributeModifier(@NotNull Attribute attribute, @NotNull AttributeModifier attributeModifier) {
                    return false;
                }

                @Override
                public void setAttributeModifiers(@Nullable Multimap<Attribute, AttributeModifier> multimap) {

                }

                @Override
                public boolean removeAttributeModifier(@NotNull Attribute attribute) {
                    return false;
                }

                @Override
                public boolean removeAttributeModifier(@NotNull EquipmentSlot equipmentSlot) {
                    return false;
                }

                @Override
                public boolean removeAttributeModifier(@NotNull Attribute attribute, @NotNull AttributeModifier attributeModifier) {
                    return false;
                }

                @Override
                public ItemMeta clone() {
                    return null;
                }

                @Override
                public Map<String, Object> serialize() {
                    return null;
                }
            };
        return meta;
    }

    @Override
    public boolean hasItemMeta() {
        return meta != null;
    }

    @Override
    public boolean setItemMeta(ItemMeta itemMeta) {
        meta = itemMeta;
        return true;
    }
}
