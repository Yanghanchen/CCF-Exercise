class Solution {
    public String simplifyPath(String path) {
        ArrayList<String> dirs=new ArrayList<>();
        String[] pathArr=path.split("/");
        for(String s:pathArr){
            if(s.equals("")||s.equals(".")){
                continue;
            }else if(s.equals("..")){
                if(!dirs.isEmpty()){
                    dirs.remove(dirs.size()-1);
                }
            }else{
                dirs.add(s);
            }
        }
        if(dirs.isEmpty()){
            return "/";
        }
        StringBuilder sb=new StringBuilder();
        for(String dir:dirs){
            sb.append("/");
            sb.append(dir);
        }
        return sb.toString();
    }
}