/*
 * Copyright (c) 2026.
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * The Vanilla Extensions Mod is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * The Vanilla Extensions Mod is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 * You should have received a copy of the GNU General Public License along with this program. If not, see
 * <https://www.gnu.org/licenses/>
 */

package com.anedhel.lotr.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Variants for the Hobbit entity.
 *
 * @author Moritz Rohleder
 * @since 0.1.0
 */
public enum HobbitVariant {
	HOBBIT_1(0),
	HOBBIT_2(1),
	HOBBIT_3(2);

	private static final HobbitVariant[] BY_ID = Arrays.stream(values())
			.sorted(Comparator.comparingInt(HobbitVariant::getId)).toArray(HobbitVariant[]::new);
	private final int id;

	HobbitVariant(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public static HobbitVariant byId(int id) {
		return BY_ID[id % BY_ID.length];
	}
}
