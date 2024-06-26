package az.ministryproject.service;

import az.ministryproject.entity.User;
import az.ministryproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    // Functional method to apply a transformation to all users
    public <R> List<R> transformUsers(Function<User, R> transformer) {
        return userRepository.findAll().stream()
                .map(transformer)
                .collect(Collectors.toList());
    }
}
