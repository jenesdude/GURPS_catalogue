package com.gurps.controller;

import com.gurps.model.Character;
import com.gurps.service.CharacterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/characters")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    // Редирект с корня на список персонажей
    @GetMapping("/")
    public String home() {
        return "redirect:/characters";
    }

    @GetMapping
    public String listCharacters(Model model) {
        model.addAttribute("characters", characterService.getAllCharacters());
        return "index";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("character", new Character());
        return "character-form";
    }

    @PostMapping("/save")
    public String saveCharacter(@ModelAttribute("character") Character character) {
        Character saved = characterService.saveCharacter(character);
        return "redirect:/characters/" + saved.getId();
    }

    @GetMapping("/{id}")
    public String viewCharacter(@PathVariable("id") Long id, Model model) {
        Character character = characterService.getCharacterById(id);
        if (character == null) {
            return "redirect:/characters";
        }
        model.addAttribute("character", character);
        return "character-view";
    }
}