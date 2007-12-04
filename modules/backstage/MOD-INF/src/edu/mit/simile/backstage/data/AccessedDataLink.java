/**
 * 
 */
package edu.mit.simile.backstage.data;

import java.net.URL;
import java.util.Date;

import org.openrdf.sail.Sail;

abstract public class AccessedDataLink extends DataLink {
    final public Date    expiresDate;
    final public Date    retrievedDate;
    final public boolean broken;
    
    public AccessedDataLink(DataLink entry, Date expiresDate2, Date retrievedDate2, boolean broken2) {
        super(entry.url, entry.mimeType, entry.charset);
        expiresDate = expiresDate2;
        retrievedDate = retrievedDate2;
        broken = broken2;
    }
    
    abstract public void loadData(URL exhibitURL, Sail sail) throws Exception;
}