/* Buffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public interface Buffer {

    public long getAddress();
    
    public int getSize();
    
    public void put(byte[] buf, int i, int j, int k);
}
