/**
   $Id: Tape.java 625 2011-06-07 06:52:42Z mviara $

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

package jmce.sim;

/**
 * Interface to rappresent a tape reader / writer.<p>
 * This version only support the read operation.
 * 
 * @author Mario Viara
 * @version 1.01
 *
 * @since 1.01
 */
public interface Tape extends Peripheral
{
	public void addTapeEventListener(TapeEventListener l);
	public void rewind() throws SIMException;
	public boolean isPlay();
	public void play() throws SIMException;
	public void rec() throws SIMException;
	public void stop()  throws SIMException;
	public TapePulse  nextPulse();
	public void setConfig(String name) throws SIMException;
	public String getConfig() throws SIMException;
	public void setPower(boolean power) throws SIMException;
	public boolean getPower() throws SIMException;
}

