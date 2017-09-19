package net.volgatech.javacore2017;
public class GetNetAddress {
    public static void main(String []args) {
        String ip;
        String mask;
        int[] ipAddress, maskAddress;
        if(args.length != 2) {
            System.out.println("Incorrect input. Should be GetNetAddress xxx.xxx.xxx.xxx yyy.yyy.yyy.yyy");
            return;
        }
        ip = args[0];
        mask = args[1];
        ipAddress = new int[4];
        maskAddress = new int[4];
        try{
            ipAddress = parseIP(ip);
            maskAddress = parseIP(mask);
            for(int i = 0; i< 4; ++i) {
                ipAddress[i] = ipAddress[i] & maskAddress[i];
            }
            System.out.println(ipAddress[0] + "." + ipAddress[1] + "." +ipAddress[2] + "." +ipAddress[3]);
        }
        catch(Throwable e)
        {
            System.out.println("Incorrect IP Address");
        }       
    }
    private static int[] parseIP(String address) throws Exception {
        int[] b = new int[4];
        String[] ipParts = address.split("\\.");
        if (ipParts.length != 4) {
            throw new Exception();
        }
        for(int i = 0; i < 4; ++i) {
            int t = Integer.parseInt(ipParts[i]);
            if(t<0||t>255){
                throw new Exception();
            }
            b[i] = t;
        }
        return b;
    }
}