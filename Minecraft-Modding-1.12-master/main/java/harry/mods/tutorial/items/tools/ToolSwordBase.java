package harry.mods.tutorial.items.tools;

import harry.mods.tutorial.Main;
import harry.mods.tutorial.init.ItemInit;
import harry.mods.tutorial.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSwordBase extends ItemSword implements IHasModel 
{
	public ToolSwordBase(String name, ToolMaterial material, CreativeTabs tab) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}
}
