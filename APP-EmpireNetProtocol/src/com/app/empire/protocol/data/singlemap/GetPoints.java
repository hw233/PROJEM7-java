package com.app.empire.protocol.data.singlemap;

import com.app.empire.protocol.Protocol;
import com.app.protocol.data.AbstractData;

public class GetPoints extends AbstractData {
	private int id;//大关卡ID
	public GetPoints(int sessionId, int serial) {
        super(Protocol.MAIN_SINGLEMAP, Protocol.SINGLEMAP_GetPoints, sessionId, serial);
    }
	public GetPoints(){
		 super(Protocol.MAIN_SINGLEMAP, Protocol.SINGLEMAP_GetPoints);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}