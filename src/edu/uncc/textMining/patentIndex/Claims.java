package edu.uncc.textMining.patentIndex;
import java.util.ArrayList;
import java.util.List;

public class Claims {
	List<Claim> claimList = new ArrayList<Claim>();

	public List<Claim> getClaimList() {
		return claimList;
	}

	public void setClaimList(Claim claim) {
		claimList.add(claim);
	}
}
