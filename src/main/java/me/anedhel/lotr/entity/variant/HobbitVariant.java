/*
 * Copyright (c)
 * Authors/Developers are listed in the CONTRIBUTING.md
 *
 * lord-of-the-rings-middle-earth is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * lord-of-the-rings-middle-earth is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 *  along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package me.anedhel.lotr.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Enum representing different variants of Hobbit entities.
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
