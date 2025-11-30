package prog.hei.school.endpoint.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import prog.hei.school.model.Asset;

import java.util.List;

@RestController
@AllArgsConstructor
public class AssetController {
    @PutMapping
    public List<Asset> crupdateAssets(@RequestBody List<Asset> assets){
        return null;
    }
    @GetMapping("/assets")
    public List<Asset> getAssets(){
        return null;
    }

}
