package com.cg.traineeBean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Trainee {
				@Id
				@NotNull
				int traineeId;
				@Size(min=5,max=20, message="Must be in the range of 5 to 20")
				String traineeName;
				String traineeDomain;
				String traineeLocation;
				
				public Trainee() {
					// TODO Auto-generated constructor stub
				}
				
				
				public int getTraineeId() {
					return traineeId;
				}
				public void setTraineeId(int traineeId) {
					this.traineeId = traineeId;
				}
				public String getTraineeName() {
					return traineeName;
				}
				public void setTraineeName(String traineeName) {
					this.traineeName = traineeName;
				}
				public String getTraineeDomain() {
					return traineeDomain;
				}
				public void setTraineeDomain(String traineeDomain) {
					this.traineeDomain = traineeDomain;
				}
				public String getTraineeLocation() {
					return traineeLocation;
				}
				public void setTraineeLocation(String traineeLocation) {
					this.traineeLocation = traineeLocation;
				}


				@Override
				public String toString() {
					return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeDomain="
							+ traineeDomain + ", traineeLocation=" + traineeLocation + "]";
				}
				
				
				
}
