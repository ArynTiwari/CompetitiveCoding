package GFG.Strings;

public class Palindrome {
    static boolean isPalindrom(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "bslrugnbxjwhlhdakjbnayzuncuuugczqqsffmakyqwunkbafpzebvbzidxhvjddlplaizotofwceogdcoguyqtyvetqxhoniombkuflbfgstlxsyxmqmqemlvgbtntxyfjtklxuqgffbkwippsmrleskgajprkyqfqctsqzwkdwhzjrfknzawejdbskshqgltpoojpsitnygtrpxbcaupjsvsilvqupyhyrviendqvkpftppxmclwttloykextqgykpyqjpjngrwxxmhxaleblfmkdnptpgrvwwigojdypxbhngsbftgjzevrdqfmrifnhiieobcwqykuxzwsiwraqlzanynttefglqtxlulgzrbyteyqgvvjmlqkdyxvqpztzkivhjctuyzvlpbhjohzmpvwadiqpmnjiurrozmtsifjawygqgxojxawgiwqogqgonpszrehpvpeqedanwreueexjdkkbtmyebjayklnjyljfwjfedvmgfgmdgetdnxpaaivkpxnubgfxdwiipceexubpvellydzjpdrmoigfrcydinwcpbsvuwgtjvmxryzwcnszdpcgyalodtazlnefhmjtlzfiktgqtbfeqpzbwjeqgnpkihmvkiinhlyfhpcivrkqglnimjkzvzcttmaqpxcyjbqktmfzjzgwokagtlancykhnfwookfhfmbyuvwrwwvbqzlbfzdilaacnuldxehsjwwraljntlviebskmsqoiygpmbxvfbrfkexrobdkqtebmbjkgdubhxejgzraifsyvezllsneuwrppvgtuyfqqhwkcfoqmpbcyyoxpqedykieobwvqepgahfeagisonyyzvjhbjztkbyfjsthchqmsggiarjvvatdiuxsqmhrbfgcirtimovoyhmgrmxvjgeigjeokpoqcvwpzcosybeivbjlzlpmlthcnffxrhkcoqpamvvpsurannpgxmvskbblpuifohsqqsvdk";
        System.out.println(isPalindrom(str));
    }
}
