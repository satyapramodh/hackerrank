class Solution {
  public enum FileType {
    MUSIC(0), IMAGES(1), MOVIES(2), OTHER(3);

    private int val;
    private FileType(int val){
      this.val = val;
    }
  }
  public String solution(String S) {
    String[] file_types = new String[FileType.values().length];
    int[] file_sizes = new int[FileType.values().length];
    StringBuilder result = new StringBuilder();

    // init file types
    file_types[FileType.MUSIC.ordinal()] = "mp3,aac,flac";
    file_types[FileType.IMAGES.ordinal()] = "jpg,bmp,gif";
    file_types[FileType.MOVIES.ordinal()] = "mp4,avi,mkv";
    file_types[FileType.OTHER.ordinal()] = "7z,txt,zip";

    for(String file : S.split("\\r?\\n")){
      String name = file.split(" ")[0];
      String size = file.split(" ")[1];
      String ext = name.substring(name.lastIndexOf(".")+1);
      int sizeInBytes = Integer.parseInt(size.substring(0, size.length() - 1));
      boolean found = false;

      for(int i=0; i<file_types.length-1; i++){
        if(file_types[i].contains(ext)){
          file_sizes[i] += sizeInBytes;
          found = true;
          break;
        }
      }

      if(!found) file_sizes[file_sizes.length - 1] += sizeInBytes;
    }

    for(FileType f : FileType.values()){
      result.append(f.name().toLowerCase() + " " + file_sizes[f.ordinal()] + "b\n");
    }

    // System.out.println(result.toString());

    return result.toString().trim();
  }
}