package miscellaneous;
/**
 * Splitting a list into N parts of approximately equal length
 * 
 * @author equester
 * @date 05-Apr-2018
 */
public class Partitioner {
	/**
	 * This method accepts number of resources and number of partitions and return
	 * range list
	 */
	public int[][] partitionResource(int sizeOfResource, int noOfPartition) {
		float range = sizeOfResource / (float) noOfPartition;
		float last = (float) 0.0;
		int start = 0, end = 0;

		int[][] rangeList = new int[noOfPartition][2];

		int partCount = 0;

		// if sizeOfResource is less than noOfPartition then i should be in one
		// partition
		if (noOfPartition <= sizeOfResource) {
			while (last < sizeOfResource) {
				start = (int) last + 1;
				end = (int) (last + range);
				// if it reaches last partition but still some elements are left then add all to
				// this part only
				if (partCount + 1 == noOfPartition) {
					end = sizeOfResource;
					rangeList[partCount][0] = start;
					rangeList[partCount][1] = end;
					break;
				}

				rangeList[partCount][0] = start;
				rangeList[partCount][1] = end;

				last = last + range;
				partCount++;
			}
		} else {
			rangeList[partCount][0] = 1;
			rangeList[partCount][1] = sizeOfResource;
		}
		return rangeList;
	}

	/**
	 * 
	 * void
	 */
	public static void main(String[] args) {
		int noOfPartition = 10;
		int n = 100;
		Partitioner partitioner = new Partitioner();
		int[][] partitionRange = partitioner.partitionResource(n, noOfPartition);

		for (int i = 0; i < noOfPartition; i++) {
			System.out.println("[" + (i + 1) + "] " + partitionRange[i][0] + "-" + partitionRange[i][1]);
		}

	}

}
