package az.ministryproject.controller;

import az.ministryproject.entity.Pass;

import az.ministryproject.service.PassService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/passes")
@RequiredArgsConstructor
public class PassController {

    private final PassService passService;

    @GetMapping
    public List<Pass> getAllPasses() {
        return passService.getAllPasses();
    }

    @GetMapping("/{id}")
    public Optional<Pass> getPassById(@PathVariable Long id) {
        return passService.getPassById(id);
    }

    @PostMapping
    public Pass createPass(@RequestBody Pass pass) {
        return passService.savePass(pass);
    }

    @PutMapping("/{id}")
    public Pass updatePass(@PathVariable Long id, @RequestBody Pass pass) {
        return passService.updatePass(id, pass);
    }

    @DeleteMapping("/{id}")
    public void deletePass(@PathVariable Long id) {
        passService.deletePass(id);
    }



    }
