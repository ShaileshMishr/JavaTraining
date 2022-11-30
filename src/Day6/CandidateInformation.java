// Create a csv file having candidate information like candidateId, name and courseEnrolledIn.
// read this file using BufferedReader and create Candidate objects(s) from this data

package JavaBasics.src.Day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CandidateInformation {

    public static void main(String[] args) throws IOException {

        String cand = "";
        int i =0;
        String[] cd = null;

        Candidate[] cdList = new Candidate[5];

        BufferedReader reader = new BufferedReader(new FileReader("Candidate.csv"));
        while((cand= reader.readLine())!=null){

            cd = cand.split(",");

            cdList[i] = new Candidate(Integer.parseInt(cd[0]),cd[1],cd[2]);
                i++;
            }

            for(int j=0; j<4;j++) {
                System.out.println(cdList[j]);
            }

        }
    }

