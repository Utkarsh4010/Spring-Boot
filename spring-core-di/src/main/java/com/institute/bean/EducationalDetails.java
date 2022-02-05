package com.institute.bean;

public class EducationalDetails {
        private String instituteName;
        private String percent;
        private String passingYear;
        public EducationalDetails(String instituteName, String percent, String passingYear) {
        	this.instituteName=instituteName;
        	this.percent=percent;
        	this.passingYear=passingYear;
        }
		public String getInstituteName() {
			return instituteName;
		}
		public String getPercent() {
			return percent;
		}
		public String getPassingYear() {
			return passingYear;
		}
		         
}
