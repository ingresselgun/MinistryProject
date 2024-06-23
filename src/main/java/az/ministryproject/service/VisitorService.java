package az.ministryproject.service;


import az.ministryproject.entity.Visitor;
import az.ministryproject.repository.VisitorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VisitorService {

    private final VisitorRepository visitorRepository;

    public List<Visitor> getAllVisitors() {
        return visitorRepository.findAll();
    }

    public Optional<Visitor> getVisitorById(Long id) {
        return visitorRepository.findById(id);
    }

    public Visitor saveVisitor(Visitor visitor) {
        return visitorRepository.save(visitor);
    }

    public Visitor updateVisitor(Long id, Visitor newVisitor) {
        return visitorRepository.findById(id)
                .map(visitor -> {
                    visitor.setFinCode(newVisitor.getFinCode());
                    visitor.setName(newVisitor.getName());
                    visitor.setContactDetails(newVisitor.getContactDetails());
                    return visitorRepository.save(visitor);
                })
                .orElseGet(() -> {
                    newVisitor.setId(id);
                    return visitorRepository.save(newVisitor);
                });
    }

    public void deleteVisitor(Long id) {
        visitorRepository.deleteById(id);
    }

    // Functional method to apply a transformation to all visitors
    public <R> List<R> transformVisitors(Function<Visitor, R> transformer) {
        return visitorRepository.findAll().stream()
                .map(transformer)
                .collect(Collectors.toList());
    }
}