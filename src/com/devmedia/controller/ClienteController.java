package com.devmedia.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.devmedia.model.Cliente;
@Controller
public class ClienteController {

    @RequestMapping(value = "/home")
    public ModelAndView cliente() {
        return new ModelAndView("/home/cliente");
    }

    @RequestMapping(value = "/addCliente", method = RequestMethod.GET)
    public ModelAndView adicionarCliente(
            @ModelAttribute("MenegassoBank") Cliente cliente, ModelMap model, HttpServletRequest request) {

        model.addAttribute("account",cliente.getAccount());
        model.addAttribute("extract",cliente.getExtract());
        List<Cliente> clientes = (List<Cliente>)
                request.getSession().getAttribute("clientes");
        if (clientes == null) {
            clientes = new ArrayList<>();
        }
        clientes.add(cliente);
        request.getSession().setAttribute("clientes", clientes);

        return new ModelAndView("/home/addCliente");
    }

    @RequestMapping(value = "/listaClientes", method = RequestMethod.GET)
    public String listarClientes(
            @ModelAttribute("SpringWeb") ModelMap model, HttpServletRequest request) {

        List<Cliente> clientes = (List<Cliente>)
                request.getAttribute("clientes");

        model.addAttribute("clientes", clientes);


        return "cliente";
    }


}
