package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

public class PhotoController {
    
    //创建一个存储图片的Map
    private final Map<String, Photo> photoRepos=new HashMap<String,Photo>() {
        {
            put("1", new Photo("1", "photo1"));
            put("2", new Photo("2", "photo2"));
        }
    };

    //获取所有图片
    @PostMapping("/")
    public Map<String, Photo> getAllPhotos() {
        return photoRepos;
    }

    //根据id获取图片
    @PostMapping("/{id}")
    public Photo getPhoto(@PathVariable String id) {
        return photoRepos.get(id);
    }


        //根据id删除图片
        @PostMapping("/{id}")
        public void deletePhoto(@PathVariable String id) {
            photoRepos.remove(id);
        }
    
        @PostMapping("/upload")
        public String uploadPhoto(@RequestParam("file") MultipartFile file) {
            try {
                String id = UUID.randomUUID().toString(); // 生成一个随机ID
                Photo photo = new Photo(id, file.getOriginalFilename()); // 创建新的Photo对象
                photoRepos.put(id, photo); // 将新的Photo对象添加到map中
    
                return "You successfully uploaded " + file.getOriginalFilename() + "!";
            } 
            catch (Exception e) {
                return "Fail to upload " + file.getOriginalFilename() + "!";
            }











}