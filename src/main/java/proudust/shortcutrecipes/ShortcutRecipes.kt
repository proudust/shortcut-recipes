package proudust.shortcutrecipes

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = ShortcutRecipes.MOD_ID, name = ShortcutRecipes.MOD_NAME, version = ShortcutRecipes.VERSION, modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter")
class ShortcutRecipes {
    companion object {
        const val MOD_ID = "shortcut-recipes"
        const val MOD_NAME = "ShortcutRecipes"
        const val VERSION = "1.12.2-v1"
    }
}
