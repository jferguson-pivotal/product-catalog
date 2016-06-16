package io.pivotal.product.PhotoService.Model;

public class PhotoService {
	

		private Long urlID;
		private String urlNAME;
		private String urlDESC;
		private String urlLink;
		private String urlVERSION;

		public PhotoService() { }

		public PhotoService(Long id, String name, String description, String url, String urlversion){
			this.urlID = id;
			this.urlNAME = name;
			this.urlDESC = description;
			this.urlLink = url;
			this.urlVERSION = urlversion;
		
		}
		
	

		public Long getId() {
			return this.urlID;
		}

		public void setId(Long idIndex) {
			this.urlID = idIndex;
		}

		public String getName() {
			return this.urlNAME;
		}

		public void setName(String name) {
			this.urlNAME = name;
		}
		public String getDesc() {
			return this.urlDESC;
		}

		public void setDesc(String urlDesc) {
			this.urlDESC = urlDesc;
		}

		public String getUrlVer() {
			return this.urlVERSION;
		}

		public void setUrlVerion(String urlVersion) {
			this.urlVERSION = urlVersion;
		}
		public String getURL() {
			return this.urlLink;
		}

		public void setURL(String url) {
			this.urlLink = url;
		}
		

		

}
