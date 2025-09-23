class Solution:
    def compareVersion(self, version1: str, version2: str) -> int:
        ver1 = version1.split(".")
        ver2 = version2.split(".")
        l1 = len(ver1)
        l2 = len(ver2)
        max_length = max(len(ver1), len(ver2))
        min_length = min(len(ver1), len(ver2))
        for i in range(0, min_length):
            s1 = int(ver1[i])
            s2 = int(ver2[i])
            if s1 > s2:
                return 1
            elif s1 < s2: 
                return -1
        if l1!=l2:
            if max_length == l1:
                for i in range(min_length, max_length):
                    s1 = int(ver1[i])
                    if s1 > 0:
                        return 1
                    elif s1 < 0: 
                        return -1
            elif max_length == l2:
                for i in range(min_length, max_length):
                    s2 = int(ver2[i])
                    if s2 > 0:
                        return -1
                    elif s2 < 0: 
                        return 1
        return 0                    
            