package me.anedhel.lotr.block.custom;

public enum StoneTypeVariants {
	STONE,
	MOSSY_STONE,
	OVERGROWN_STONE,
	BRONZE_STONE,
	MOSSY_BRONZE_STONE,
	OVERGROWN_BRONZE_STONE,
	SILVER_STONE,
	MOSSY_SILVER_STONE,
	OVERGROWN_SILVER_STONE,
	GOLD_STONE,
	MOSSY_GOLD_STONE,
	OVERGROWN_GOLD_STONE,
	CRACKED_STONE,
	CRACKED_MOSSY_STONE,
	CRACKED_OVERGROWN_STONE,
	CRACKED_BRONZE_STONE,
	CRACKED_MOSSY_BRONZE_STONE,
	CRACKED_OVERGROWN_BRONZE_STONE,
	CRACKED_SILVER_STONE,
	CRACKED_MOSSY_SILVER_STONE,
	CRACKED_OVERGROWN_SILVER_STONE,
	CRACKED_GOLD_STONE,
	CRACKED_MOSSY_GOLD_STONE,
	CRACKED_OVERGROWN_GOLD_STONE;

	public static String getRecipePath(StoneTypeVariants variant, String name) {
		switch(variant) {
			case STONE -> {
				return name;
			}
			case MOSSY_STONE -> {
				return "m_" + name;
			}
			case OVERGROWN_STONE -> {
				return "o_" + name;
			}
			case BRONZE_STONE -> {
				return "b_" + name;
			}
			case MOSSY_BRONZE_STONE -> {
				return "m_b_" + name;
			}
			case OVERGROWN_BRONZE_STONE -> {
				return "o_b_" + name;
			}
			case SILVER_STONE -> {
				return "s_" + name;
			}
			case MOSSY_SILVER_STONE -> {
				return "m_s_" + name;
			}
			case OVERGROWN_SILVER_STONE -> {
				return "o_s_" + name;
			}
			case GOLD_STONE -> {
				return "g_" + name;
			}
			case MOSSY_GOLD_STONE -> {
				return "m_g_" + name;
			}
			case OVERGROWN_GOLD_STONE -> {
				return "o_g_" + name;
			}
			case CRACKED_STONE -> {
				return "c_" + name;
			}
			case CRACKED_MOSSY_STONE -> {
				return "c_m_" + name;
			}
			case CRACKED_OVERGROWN_STONE -> {
				return "c_o_" + name;
			}
			case CRACKED_BRONZE_STONE -> {
				return "c_b_" + name;
			}
			case CRACKED_MOSSY_BRONZE_STONE -> {
				return "c_m_b_" + name;
			}
			case CRACKED_OVERGROWN_BRONZE_STONE -> {
				return "c_o_b_" + name;
			}
			case CRACKED_SILVER_STONE -> {
				return "c_s_" + name;
			}
			case CRACKED_MOSSY_SILVER_STONE -> {
				return "c_m_s_" + name;
			}
			case CRACKED_OVERGROWN_SILVER_STONE -> {
				return "c_o_s_" + name;
			}
			case CRACKED_GOLD_STONE -> {
				return "c_g_" + name;
			}
			case CRACKED_MOSSY_GOLD_STONE -> {
				return "c_m_g_" + name;
			}
			case CRACKED_OVERGROWN_GOLD_STONE -> {
				return "c_o_g_" + name;
			}
			default -> {
				return "";
			}
		}
	}

	public static boolean isOrnamented(StoneTypeVariants variant) {
		switch(variant) {
			case BRONZE_STONE, MOSSY_BRONZE_STONE, OVERGROWN_BRONZE_STONE,
					SILVER_STONE, MOSSY_SILVER_STONE, OVERGROWN_SILVER_STONE,
					GOLD_STONE, MOSSY_GOLD_STONE, OVERGROWN_GOLD_STONE -> {
				return true;
			}
			default -> {
				return false;
			}
		}
	}

	public static boolean isCracked(StoneTypeVariants variant) {
		switch(variant) {
			case CRACKED_STONE, CRACKED_MOSSY_STONE, CRACKED_OVERGROWN_STONE,
					CRACKED_BRONZE_STONE, CRACKED_MOSSY_BRONZE_STONE, CRACKED_OVERGROWN_BRONZE_STONE,
					CRACKED_SILVER_STONE, CRACKED_MOSSY_SILVER_STONE, CRACKED_OVERGROWN_SILVER_STONE,
					CRACKED_GOLD_STONE, CRACKED_MOSSY_GOLD_STONE, CRACKED_OVERGROWN_GOLD_STONE -> {
				return true;
			}
			default -> {
				return false;
			}
		}
	}
}
