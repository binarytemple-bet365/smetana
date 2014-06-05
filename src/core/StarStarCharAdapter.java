/* ========================================================================
 * JDot  : Port from C to Java of GraphViz
 * ========================================================================
 *
 * (C) Copyright 2012, Arnaud Roques
 *
 * Project Info:  http://plantuml.sourceforge.net/jdot/jdot.html
 * 
 * This file is part of JDot.
 *
 * JDot is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JDot distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 * 
 * GraphViz itself is distributed under Eclipse Public License v1.0:
 * 
 *************************************************************************
 * Copyright (c) 2011 AT&T Intellectual Property 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: See CVS logs. Details at http://www.graphviz.org/
 *************************************************************************/
package core;

// http://docs.oracle.com/javase/specs/jls/se5.0/html/expressions.html#15.7.4
// http://www.jbox.dk/sanos/source/lib/string.c.html

public abstract class StarStarCharAdapter implements StarStarChar {

	public void memset(int value, size_t size) {
		throw new UnsupportedOperationException();
	}

	public StarVoid castTo(Class clazz) {
		throw new UnsupportedOperationException();
	}

	public void memcopyFrom(StarVoid from) {
		throw new UnsupportedOperationException();
	}

	public StarVoid addByte(OFFSET offset) {
		throw new UnsupportedOperationException();
	}

	public StarVoid addByte(int offset) {
		throw new UnsupportedOperationException();
	}

	public Object getParentStructure() {
		throw new UnsupportedOperationException();
	}

	public void setParentStructure(Object parent) {
		throw new UnsupportedOperationException();
	}


	public StarChar bracket(int position) {
		throw new UnsupportedOperationException();
	}

	public StarChar setBracket(int position, StarChar data) {
		throw new UnsupportedOperationException();
	}

	public int size() {
		throw new UnsupportedOperationException();
	}

	public StarStarChar plus(int pointerArithmetic) {
		throw new UnsupportedOperationException();
	}

}