/**
   $Id: DuplicateMemory.java 510 2011-01-18 09:25:07Z mviara $

   Copyright (c) 2010, Mario Viara

   Permission is hereby granted, free of charge, to any person obtaining a
   copy of this software and associated documentation files (the "Software"),
   to deal in the Software without restriction, including without limitation
   the rights to use, copy, modify, merge, publish, distribute, sublicense,
   and/or sell copies of the Software, and to permit persons to whom the
   Software is furnished to do so, subject to the following conditions:

   The above copyright notice and this permission notice shall be included in
   all copies or substantial portions of the Software.

   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL
   ROBERT M SUPNIK BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
   IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
   CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

   Except as contained in this notice, the name of Mario Viara shall not be
   used in advertising or otherwise to promote the sale, use or other dealings
   in this Software without prior written authorization from Mario Viara.
*/
package jmce.sim.memory;

import jmce.sim.*;

/**
 * Helper class to duplicate one memory. Used only by inner class.
 *
 * @author Mario Viara
 * @version 1.00
 */
public abstract class DuplicateMemory extends AbstractMemory implements Memory
{
	private AbstractMemory memory;
	
			
	protected DuplicateMemory()
	{
	}

	protected DuplicateMemory(AbstractMemory memory)
	{
		setMemoryModel(memory);
	}

	public void registerCPU(CPU cpu) throws SIMException
	{
		super.registerCPU(cpu);
		memory.registerCPU(cpu);
	}

	public void setMemoryModel(AbstractMemory memory)
	{
		this.memory = memory;

	}

	public Memory getMemoryModel()
	{
		return memory;
	}

	public void init(Hardware parent) throws SIMException
	{
		memory.init(parent);
		super.init(parent);
		
	}
	

	protected AbstractMemory mapMemory(int a)
	{
		return memory;
	}
	
	public String toString()
	{
		return "Duplicate of "+memory.toString();
	}

}

