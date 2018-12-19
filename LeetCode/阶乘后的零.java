class Solution {
    //其实就是算5出现的次数，如果n<5，必然不可能出现0
    //如果是5~10之间，只可能出现1次，以此类推
    //注意 25、125、625等数，要多计几次，一直除以5即可
    public int trailingZeroes(int n) {
        return n<5?0:n/5+trailingZeroes(n/5);
    }
}