package alpha.fod.skyr.block;

import java.util.Random;

import alpha.fod.skyr.SkyrRef;

import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class BlockOres extends BlockStone
{

	public BlockOres(int par1, int par2, Material par3Material) {
		super(par1, par2);
		
	}

	public int idDropped(int par1, Random par2Random, int par3) 
	{
		return this.blockID;
	}
	
	public String getTextureFile(){
		return SkyrRef.block;
	}
	
	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
	{
		super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
		int var8 = 0;	
        if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
        {
        	var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 1, 3);
        }
        this.dropXpOnBlockBreak(par1World, par2, par3, par4, var8);
	}
}
