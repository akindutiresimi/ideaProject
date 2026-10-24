package com.lastma.data.repositories;

import com.lastma.data.models.Police;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceRepositoryImplTest {
    private PoliceRepositoryImpl policeRepository;
    private Police police;

    @BeforeEach
    public void setUp() {
        policeRepository = new PoliceRepositoryImpl();
        police = new Police();
    }

    @Test
    public void testThatWhenISavePolice_countIsOne() {
        assertEquals(0L, policeRepository.count());
        policeRepository.save(police);
        assertEquals(1L, policeRepository.count());
    }

    @Test
    public void testThatWhenTwoPoliceAreSaved_countIsTwo() {
        assertEquals(0L, policeRepository.count());
        Police policeOne = new Police();
        Police policeTwo = new Police();
        policeRepository.save(policeOne);
        policeRepository.save(policeTwo);
        assertEquals(2L, policeRepository.count());
    }

    @Test
    public void testThatSavedPoliceGetsAnId() {
        Police savedPolice = policeRepository.save(police);
        assertEquals(1, savedPolice.getId());
    }

    @Test
    public void testThatWhenFindByIncorrectId_errorIsThrown() {
        policeRepository.save(police);
        assertThrows(IllegalArgumentException.class, () -> policeRepository.findById(6));
    }

    @Test
    public void testThatWhenIFindById_policeIsFound() {
        Police savedPolice = policeRepository.save(police);
        int policeId = savedPolice.getId();
        assertEquals(savedPolice, policeRepository.findById(policeId));
    }

    @Test
    public void testThatWhenIDeletePolice_countIsZero() {
        Police savedPolice = policeRepository.save(police);
        policeRepository.del(savedPolice.getId());
        assertEquals(0L, policeRepository.count());
    }

    @Test
    public void testThatWhenIDeleteIdThatDoesNotExist_errorIsThrown() {
        policeRepository.save(police);
        assertThrows(IllegalArgumentException.class, () -> policeRepository.del(4));
    }

    @Test
    public void testThatWhenIDeleteOneOfTwoPolice_theOtherRemains() {
        Police policeOne = policeRepository.save(new Police());
        Police policeTwo = policeRepository.save(new Police());
        policeRepository.del(policeTwo.getId());
        assertEquals(1L, policeRepository.count());
        assertTrue(policeRepository.existById(policeOne.getId()));
    }

    @Test
    public void testThatWhenICheckExistById_itReturnsTrue() {
        Police savedPolice = policeRepository.save(police);
        assertTrue(policeRepository.existById(savedPolice.getId()));
    }

    @Test
    public void testThatWhenICheckExistByIdOfMissingPolice_itReturnsFalse() {
        assertFalse(policeRepository.existById(10));
    }
}