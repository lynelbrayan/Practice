import cv2
import numpy as np
import os


directory = r'D:/img_output/'
try:
    os.mkdir(directory)
except Exception as e:
    print(e)

image = cv2.imread('E:/enrique-iglesias-17a.jpg')
cv2.imshow("Actual_Image",image)
intensity_matrix=np.ones(image.shape,dtype="uint8")*60
print(intensity_matrix)
bi=cv2.add(image,intensity_matrix)
cv2.imshow("bright",bi)
di=cv2.subtract(image,intensity_matrix)
cv2.imshow("dark",di)
cv2.waitKey(0)

cv2.imwrite(directory+"bright.jpg",bi)
cv2.imwrite(directory+"dark.jpg",di)


cv2.destroyAllWindows()
