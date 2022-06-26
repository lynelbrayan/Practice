import cv2 as cv

cascade_face=cv.CascadeClassifier('haarcascade_frontalface_default.xml')

cap=cv.VideoCapture(0)


while(True):
    ret, img=cap.read()
    g = cv.cvtColor(img,cv.COLOR_BGR2GRAY)
    f = cascade_face.detectMultiScale(
        g,
        scaleFactor =1.3,
        minNeighbors =5,
        minSize =(30,30),
    )
    
    for (x,y,w,h) in f:
        cv.rectangle(img, (x, y), (x+w, y+h), (255, 0, 0), 2)
        gray_r=g[y: y+h, x: x+w]
        
    
    cv.imshow('video', img )
    k= cv.waitKey(30)  & 0xff

    if k == 27:
        break

cap.release()
cv.destroyAllWindows()
