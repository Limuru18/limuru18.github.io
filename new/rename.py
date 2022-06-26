import os
path = 'picture'#选择路径
filelist = os.listdir(path)

i = 0#过程循环
for item in filelist:
        #print('item name is ',item)
        # jpg\png\bmp\xml  任何格式都支持，但是需要手动修改格式类型
        if item.endswith('.jpg'):#在这里修改格式类型
                i = i + 1
                # 将图片递增
                name = str(i)
                # 将数字转换为字符串才能命名
                src = os.path.join(os.path.abspath(path),item)
                # 原始图像的路径
                dst = os.path.join(os.path.abspath(path),'QQ图片' + name + '.jpg')#格式为'图片名'+数字（从0开始）+后缀（.jpg）
                # 目标图像路径
        try:
                os.rename(src,dst)
                print('rename from %s to %s'%(src,dst))
                # 将转换结果在终端打印出来以便检查
        except:
                continue
