class Solution:
    def addBinary(self, a: str, b: str) -> str:
        i = len(a)-1
        j = len(b)-1
        ans = []
        carry = 0
        while i >= 0 or j >= 0:
            sum = carry
            if i >= 0:
                sum += ord(a[i]) - ord("0")
            if j >= 0:
                sum += ord(b[j]) - ord("0")   
            carry = sum // 2
            ans.append(chr((sum%2)+ord("0")))
            i -= 1
            j -= 1

        if carry == 1:
            ans.append("1")    

        ans.reverse()
        return "".join(ans)

        