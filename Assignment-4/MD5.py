import hashlib
str = "Mohsin"
result = hashlib.md5(str.encode())
print("Originally String is :: ", str)
print("MD5 Output is :: ",result.hexdigest())
