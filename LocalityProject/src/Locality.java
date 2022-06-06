
	public class Locality {
		
		private Area [] areas = new Area[10];
		
		
		public Locality() {
		
		}
		public Area[] getAreas() {
			return areas;
		}
		
		public void setAreas(Area[] areas) {
			this.areas = areas;
		}
		
		

}
	class Area{
	private String name;
	

	public Area(String name) {		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Area name=" + name ;
	}
	
	
}
