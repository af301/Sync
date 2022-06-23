import os
import shutil

PATH = os.getcwd()
print(PATH)

filetypes = [".doc",".txt" ,".pdf", ".mp4", ".mp3", ".wav", ".exe", ".jpg", ".zip", ".tpz", ".msi"]

for filetype in filetypes:

  for files in os.listdir(PATH):

    if files.endswith(filetype):

      if (os.path.isdir(PATH + "\\" + filetype[-3:].lower())) != True:
        os.mkdir(PATH + "\\" + filetype[-3:].lower())
      else:
        pass

      shutil.move(PATH + "\\" + files, filetype[-3:].lower())
      
print("part 1 done".upper())

filetypes =[".docx", ".jpeg"]

for filetype in filetypes:

  for files in os.listdir(PATH):

    if files.endswith(filetype):

      if (os.path.isdir(PATH + "\\" + filetype[-4:].lower())) != True:
        os.mkdir(PATH + "\\" + filetype[-4:, -1:].lower())
      else:
        pass

      shutil.move(PATH + "\\" + files, filetype[-4:].lower())
      
print("part 2 done".upper())