package io.pivotal.product.PhotoService.Stub;

import java.util.ArrayList;
import java.util.UUID;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.pivotal.product.PhotoService.Model.PhotoService;

public class PhotoServiceStub {
	



/*
        Long urlID;
		String urlNAME;
		String urlDESC;
		String urlLink;
		String urlVERSION;
 */
	private static Map<Long,PhotoService> photos = new HashMap<Long, PhotoService>(); 

		//populate initial photos
	private static Long idIndex = 3L;
		static {
			PhotoService DWBv1 = new PhotoService(1L,"doggiewithball", "doggie with Ball", "http://shareamazingpictures.com/wp-content/uploads/2012/12/Doggie-with-ball.jpg", "1.0");
			photos.put(1L,DWBv1);
			PhotoService CWBv1 = new PhotoService(2L,"catwithball", "cat with Ball", "https://www.petfinder.com/wp-content/uploads/2012/11/140265615-overweight-cat-treatball-632x475.jpg", "1.0");
			photos.put(2L,CWBv1);
			
			
		}

		public static List<PhotoService> list() {
			return new ArrayList<PhotoService>(photos.values());
		}
/*
		public  static PhotoService create(String name,String url) {
			//String randomID = UUID.randomUUID().toString();
			idIndex += idIndex;
			PhotoService newPhoto = new PhotoService();
			newPhoto.setId(idIndex);
			
			newPhoto.setName(name);
			newPhoto.setURL(url);
			photos.put(idIndex, newPhoto);
			return newPhoto;
		}
		**/

		public  static PhotoService create(PhotoService newPhoto) {
			//String randomID = UUID.randomUUID().toString();
			idIndex += idIndex;

			photos.put(idIndex, newPhoto);
			return newPhoto;
		}


		public static PhotoService get(Long idPhoto) {
			//System.out.println(photos);
			return photos.get(idPhoto);

		}

		public static PhotoService update(Long id, PhotoService photoEdit) {
			photos.put(id, photoEdit);
			return photoEdit;
		}

		public static PhotoService delete(Long idPhoto) {
			return photos.remove(idPhoto);
		}
	

}
