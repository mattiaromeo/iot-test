import requests
import random
import time
import json

headers = {'Accept' : 'application/json', 'Content-Type' : 'application/json'}
tempStoreUrl = 'http://192.168.0.254:8080/iot/storeTempData'


def postKV(key, value, url, headers):
    d = '{"' + key + '":' + str(value) + '}'
    r = requests.post(url, data=d, headers=headers)
    print(r)
    return


while 1:
    key = "temp"
    value = random.random()
    postKV(key, value, tempStoreUrl, headers)
    time.sleep(1)



