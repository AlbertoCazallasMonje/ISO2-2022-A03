package banco;

class Customer {
	   // as many attributes as possible
	   private BirthDate birthDate;
	   private boolean isStudent;
	   private boolean isWorking;
	   private boolean permanentResidencyWithParents;

	   public Customer(BirthDate birthDate, boolean isStudent, boolean isWorking, boolean permanentResidencyWithParents) {
	       setBirthDate(birthDate);
	       setStudent(isStudent);
	       setWorking(isWorking);
	       setPermanentResidencyWithParents(permanentResidencyWithParents);
	   }

	   public void setBirthDate(BirthDate birthDate) {
	       if (birthDate == null)
	           throw new IllegalArgumentException("Argument needs to be initialized");

	       this.birthDate = birthDate;
	   }

	   public void setStudent(boolean student) {
	       isStudent = student;
	   }

	   public void setWorking(boolean working) {
	       isWorking = working;
	   }

	   public void setPermanentResidencyWithParents(boolean permanentResidencyWithParents) {
	       this.permanentResidencyWithParents = permanentResidencyWithParents;
	   }

	   public boolean isStudent() {
	       return isStudent;
	   }

	   public boolean isWorking() {
	       return isWorking;
	   }

	   public boolean isPermanentResidencyWithParents() {
	       return permanentResidencyWithParents;
	   }

	   public BirthDate getBirthDate() {
	       return birthDate;
	   }
	}
