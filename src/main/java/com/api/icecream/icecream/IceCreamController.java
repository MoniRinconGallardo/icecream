package com.api.icecream.icecream;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/icecreams")
public class IceCreamController {

  @Autowired
  private IceCreamRepository icecreamRepository;

  @GetMapping
  public List<IceCream> getAllIceCreams() {
    return icecreamRepository.findAll();
  } 

  @GetMapping("/{id}")
  public IceCream getIceCreamById(@PathVariable Long id) {
    return icecreamRepository.findById(id).get();
  }

  @PostMapping
  public IceCream createIceCream(@RequestBody IceCream icecream) {
    return icecreamRepository.save(icecream);
  }
}