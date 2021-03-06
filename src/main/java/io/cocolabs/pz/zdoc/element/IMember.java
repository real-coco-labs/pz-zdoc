/*
 * ZomboidDoc - Lua library compiler for Project Zomboid
 * Copyright (C) 2020-2021 Matthew Cain
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package io.cocolabs.pz.zdoc.element;

import io.cocolabs.pz.zdoc.element.mod.MemberModifier;

/**
 * Member is an interface that reflects identifying information about
 * a single member (a field or a method) or a constructor.
 *
 * @see java.lang.reflect.Member
 */
public interface IMember {

	/**
	 * Returns the simple name of the underlying member or constructor
	 * represented by this Member.
	 *
	 * @return the simple name of the underlying member
	 */
	String getName();

	MemberModifier getModifier();

	String getComment();
}
