package com.parkk.web.Gym;


import com.parkk.web.proxy.Box;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.parkk.web.proxy.Proxy;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/GYM")
public class GymController {
    @Autowired GymRepository gymRepository;
    @GetMapping("/list")
    public List<Gym> list() {
        System.out.println("a");
        return gymRepository.findAll();
    }

    public List<Gym> list1(@PathVariable String location){
        List<Gym> all = gymRepository.findAll();

        return  null;
    }
    @GetMapping("/search")
    public List<Gym> search(){
        List<Gym> list = gymRepository.list("용산구");
        System.out.println(gymRepository.list("용산구").toString());
        return  list;
    }
    @GetMapping("/search2")
    public List<Gym> search2(){
        List<Gym> list2 = gymRepository.list2("중구");
        System.out.println(gymRepository.list2("중구").toString());
        return  list2;
    }
    @GetMapping("/search3")
    public List<Gym> search3(){
        List<Gym> list3 = gymRepository.list3("종로구");
        System.out.println(gymRepository.list3("종로구").toString());
        return  list3;
    }
}

//    @GetMapping("/{searchWord}")
//    public Map<?,?> list2(@PathVariable String searchWord) {
//        System.out.println(searchWord);
//        pxy.print("넘어옴");
//        List<Gym2> list2 = gymRepository.findAll2();
//        List<Gym3> list3 = gymRepository.findAll3();
//        box.clear();
//        box.put("list", list2);
//        return box.get();
//    }

//    @GetMapping("/{searchWord}")
//    public HashMap<String, Object> gym(@PathVariable String searchWord){
//        pxy.print("넘어온 키워드: "+searchWord);
//        if(gymRepository.count() == 0) gymRepository.findAll();
//        List<Gym> list = gymRepository.findAll();
//        box.put("count", list.size());
//        box.put("list", list);
//        pxy.print("조회한 수: "+list.size());
//        return gymRepository.get();
